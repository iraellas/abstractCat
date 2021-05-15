public abstract class Cat {
    private String name;
    private String breed;


    public Cat(String name, String breed) {
        this.name = name;
        this.breed = breed;

    }

    abstract void whereLeave();

    public String getBreed() {
        return breed;
    }




    public String getName() {
        return name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }
}
