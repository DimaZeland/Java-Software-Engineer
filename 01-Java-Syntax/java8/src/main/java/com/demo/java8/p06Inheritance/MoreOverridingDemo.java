package com.demo.java8.p06Inheritance;

class Alpha1{
   String name;
   void show(){
      System.out.println("Объект "+name);
   }
   Alpha1(String name){
      this.name=name;
   }
}
class Bravo1 extends Alpha1{
   int code;
   void show(){
      // Вызов версии метода из суперкласса:
      super.show();
      System.out.println("Числовое поле "+code);
   }
   Bravo1(String name,int code){
      // Вызов конструктора суперкласса:
      super(name);
      this.code=code;
   }
}
class MoreOverridingDemo{
   public static void main(String[] args){
      Alpha1 objA=new Alpha1("objA");
      Bravo1 objB=new Bravo1("objB",123);
      objA.show();
      objB.show();
   }
}