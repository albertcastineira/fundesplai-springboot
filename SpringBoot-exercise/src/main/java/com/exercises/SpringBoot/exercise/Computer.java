package com.exercises.SpringBoot.exercise;

public class Computer {
    private String name;
    private String graphicCard;
    private String cpu;
    private String ram;

    public Computer(String name, String graphicCard, String cpu, String ram) {
        setName(name);
        setGraphicCard(graphicCard);
        setCpu(cpu);
        setRam(ram);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }
}
