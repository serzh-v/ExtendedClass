package com.mycompany.extendedclass;

/**
 * класс о котором спрашивается в задании
 */
public class ExtendedClass {
    byte b;
    int i;
    double d;
    String s;
    
    public ExtendedClass(byte b, int i, double d, String s){
        this.b = b;
        this.i = i;
        this.d = d;
        this.s = s;
    }
    
    //переопределение метода toString для нашего класса
    @Override
    public String toString(){
        return "Extended class var: b=" + b + " i=" + i + " d=" + d + " s=\"" + s + "\"";
    }
    
    //переопределение equals
    @Override
    public boolean equals(Object object){
        //проверка на null
        if (object == null) {
            return false;
        }
        //проверка на принадлежность к одному классу
        if (ExtendedClass.class != object.getClass()){
            return false;
        }
        //проверяем, сравниваем ли мы объект сам с собой
        if (this == object){
            return true;
        }
        //объекты равны только при совпадении значений всех полей
        ExtendedClass ecObject = (ExtendedClass) object;
        return 
                this.b == ecObject.b && 
                this.i == ecObject.i && 
                this.d == ecObject.d && 
                this.s.equals(ecObject.s);
        
    }
    
    //переопределяем hashCode
    @Override
    public int hashCode(){
        int result = 17;
        result = result * 23 + this.b;
        result = result * 23 + this.i;
        // преобразование 64-битного double в 2 32-разрядных int
        long longBits = Double.doubleToLongBits(this.d);
        result = 23 * result + (int)(longBits);
        result = 23 * result + (int)(longBits >>> 32);
        for (int i = 0; i < this.s.length(); i++) {
            result = 23 * result + (int)(this.s.charAt(i));
        }
        return result;
    }
    
}
