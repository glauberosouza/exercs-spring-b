package br.com.o8k.academy.exercsspringb.model;

public class PostMachineRequest {
    private String name;
    private String model;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "PostMachineRequest{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
