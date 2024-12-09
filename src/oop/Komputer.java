package oop;

public class Komputer {
    private String merek;
    private int storage;
    private String VGA;
    private String processor;
    private int RAM;

    public Komputer() {
    }

    public Komputer(String merek, int storage, String VGA, String processor, int RAM) {
        this.merek = merek;
        this.storage = storage;
        this.VGA = VGA;
        this.processor = processor;
        this.RAM = RAM;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String getVGA() {
        return VGA;
    }

    public void setVGA(String VGA) {
        this.VGA = VGA;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }
    
    
}
