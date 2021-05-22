package model;

public class Client {
    private String name;
    private int age;
    

    public Client(String name, int age) {
        setName(name);
        setAge(age);
    }


    private void setName(String name) {
        String novoNome = name.trim().replace("\\s{2,}", " ");
        if(novoNome.length() >= 5) {
            this.name = novoNome;
        }
    }

    private void setAge(int age) {
        if( age > 15) {
            this.age = age;
        } else {
            this.age = 18;
        }
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public boolean isElderly() {
        return age >= 60;
    }

    @Override
    public String toString() {
        return name  + ":" + age;
    }

}