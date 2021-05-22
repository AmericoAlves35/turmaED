package model;

public class Client {
    private String name;
    private int age;
    

    public Client(String name, int age) {
        setName(name);
        setAge(age);
    }


    private void setName(String name) {
        String etapa1 = name.replace("\\s{2,}", " ");
        System.out.println(etapa1);
        String novoNome = etapa1.trim();

        if(novoNome.length() >= 5) {
            this.name = novoNome;
        } else {
            this.name = "No name";
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