package Builder;

import AbstractFactory.Classes.LGRefrigerator;

public class User implements Cloneable{
    private RefBuilder refBuilder;
    private String name;
    private int age;

    public User(){

    }

    public User(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setRefBuilder(RefBuilder refBuilder){
        this.refBuilder = refBuilder;
    }

    public LGRefrigerator chooseModel(){
        refBuilder.createRef();
        refBuilder.assignName();
        refBuilder.assignType();
        refBuilder.assignHeight();

        return refBuilder.getLgRef();
    }

    @Override
    public User clone() throws CloneNotSupportedException {
        return (User) super.clone();
    }

    @Override
    public String toString() {
        return "SomeUser{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
