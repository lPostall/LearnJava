package com.company;

public class Kotik {

    public void play()
    {
        System.out.println("Котик поиграл");
    }


    public void sleep()
    {
        System.out.println("Котик поспал");
    }


    public void run()
    {
        System.out.println("Котик побегал");
    }


    public void walk()
    {
        System.out.println("Котик погулял");
    }


    public void climb()
    {
        System.out.println("Котик залез");
    }


    public void jump()
    {
        System.out.println("Котик подпрыгнул");
    }

    public void liveAnotherDay()
    {
        for (int i = 0; i < 24 ; i++)
        {
            int rnd = (int) (Math.random()*6 + 1);
            int rand = (int) (Math.random()*3 + 1);

            if(satiety<=0)
            {
              eat();
            }
            else
            {
                switch (rnd)
                {
                    case 1: play();
                        break;
                    case 2: sleep();
                        break;
                    case 3: run();
                        break;
                    case 4: walk();
                        break;
                    case 5: climb();
                        break;
                    case 6: jump();
                        break;
                }
                satiety = satiety - 5;
            }
        }
    }



    public void eat(int a)
    {
        satiety = satiety + a;
        System.out.println("Котик хочет кушать\n" + "Котик поел:" + "Сытость" + satiety);

    }

    public void eat(int a, int food)
    {
        satiety = satiety + a;
        if (food == 1)
        {
            fruit = "apple";
        }
        else if (food == 2)
        {
            fruit = "orange";
        }
        else
        {
            fruit = "tomato";
        }
        System.out.println("Котик хочет кушать\n" + "Котик поел: " + fruit + "\n" + "Сытость-" + satiety);

    }

    public void eat()
    {
        //System.out.println(satiety);
        eat((int) (Math.random()*10 + 1),(int) (Math.random()*3 + 1));
    }


    int satiety=10;
    int n = (int) (Math.random()*10 + 1);
    int food = (int) (Math.random()*3 + 1);
    int prettiness;
    int weight;
    String name;
    String meow;
    String fruit;

    //Конструктор без параметров, он идентичен конструктору по умолчанию,
    //который сюда бы подставила Java,
    // Но она его не подставит, по той причине,
    //что ниже определяется другой конструктор, с параметрами.
    public Kotik() {
    }

    public Kotik(int prettiness, int weight, String name, String meow)
    {this.prettiness = prettiness;
        this.weight = weight;this.name = name;this.meow = meow;}


    void setKotik(int prettiness, String name, int weight, String meow) {
        this.prettiness = prettiness;
        this.weight = weight;
        this.name = name;
        this.meow = meow;
    }
}
