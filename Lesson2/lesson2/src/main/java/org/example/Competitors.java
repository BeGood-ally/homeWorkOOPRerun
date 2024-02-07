package org.example;

public class Competitors {
    public static Creation [] creComp = new Creation[9];
    public static ObstacleCourse [] obtCrse = new ObstacleCourse[3];
    static int i = 0;
    static int j = 0;

    public static void addCreation(Creation a){
        if(i < creComp.length){
            creComp[i] = a;
            i++;
            //System.out.println("Added " + a.name);
        }
        else System.out.println("Enough competitors");
    }

    public static void addObstacle(ObstacleCourse b){
        if(j < obtCrse.length){
            obtCrse[j] = b;
            j++;
        }
        else System.out.println("Obstacle course filled");
    }

    public static void showCreation(int j){
        System.out.println("Creation number " + j + " is " + creComp[j].name);
    }

    public static void Race(){
        for (int k = 0; k < creComp.length; k++) {
            for (int l = 0; l < obtCrse.length; l++) {
                if((creComp[k].runLength > obtCrse[l].Length) && (creComp[k].jumpHeight > obtCrse[l].Height)){
                    System.out.println(creComp[k].name + " преодолел препятствие " + (1+l));
                }
                else {
                    System.out.println(creComp[k].name + " не преодолел препятствие " + (1+l));
                    break;
                }
            if(l == 2){System.out.println(creComp[k].name + " достиг финиша");}
            }
        }
    }
}
