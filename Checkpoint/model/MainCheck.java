package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainCheck {

    public static void main(String[] args) {

        System.out.println("Personajes");
        Actor Coco = new Actor(4510, "Coco", "Coco");
        Actor Thor = new Actor(4511, "Thor", "Thor");
        Actor Max = new Actor(4512, "Max", "Max");
        Actor Rocky = new Actor(4513, "Rocky", "Rocky");

        Personaje Toby = new Personaje(Coco, "Toby");
        Personaje Simba = new Personaje(Thor, "Simba");
        Personaje Leo = new Personaje(Max, "Leo");
        Personaje Lucas = new Personaje(Rocky, "Lucas");


        System.out.println("Capitulos");
        Capitulo cap1_season1_serie1 = new Capitulo(1, "capitulo 1 temporada 1 serie 1", 22.5f, true);
        Capitulo cap2_season1_serie1 = new Capitulo(2, "capitulo 2 temporada 1 serie 1", 22.5f, true);
        Capitulo cap3_season1_serie1 = new Capitulo(3, "capitulo 3 temporada 1 serie 1", 22.5f, true);
        Capitulo cap1_season2_serie1 = new Capitulo(1, "capitulo 1 temporada 2 serie 1", 22.5f, true);
        Capitulo cap2_season2_serie1 = new Capitulo(2, "capitulo 2 temporada 2 serie 1", 22.5f, true);
        Capitulo cap1_season3_serie1 = new Capitulo(1, "capitulo 1 temporada 3 serie 1", 22.5f, true);
        Capitulo cap2_season3_serie1 = new Capitulo(2, "capitulo 2 temporada 3 serie 1", 22.5f, false);
        Capitulo cap3_season3_serie1 = new Capitulo(3, "capitulo 3 temporada 3 serie 1", 22.5f, false);
        Capitulo cap1_season1_serie2 = new Capitulo(1, "capitulo 1 temporada 1 serie 2", 22.5f, true);
        Capitulo cap2_season1_serie2 = new Capitulo(2, "capitulo 2 temporada 1 serie 2", 22.5f, true);
        Capitulo cap3_season1_serie2 = new Capitulo(3, "capitulo 3 temporada 1 serie 2", 22.5f, true);


        System.out.println("Creando Temporadas");
        Temporada season1_serie1 = new Temporada(1, 2021, true, true,
                Arrays.asList(cap1_season1_serie1, cap2_season1_serie1, cap3_season1_serie1));

        Temporada season2_serie1 = new Temporada(2, 2021, true, true,
                Arrays.asList(cap1_season2_serie1, cap2_season2_serie1));

        Temporada season3_serie1 = new Temporada(3, 2021, true, false,
                Arrays.asList(cap1_season3_serie1, cap2_season3_serie1, cap3_season3_serie1));

        Temporada season1_serie2 = new Temporada(1, 2021, true, true,
                Arrays.asList(cap1_season1_serie2, cap2_season1_serie2, cap3_season1_serie2));



        System.out.println("Series");
        Serie serie1 = new Serie(1,  "breaking bad", "Titulo Serie 1",  2010, "terror",  Arrays.asList(season1_serie1, season2_serie1, season3_serie1), Arrays.asList(Toby, Simba));
        Serie serie2 = new Serie(2,  "breaking bad", "Titulo Serie 1",  2010, "terror",  Arrays.asList(season1_serie1, season2_serie1, season3_serie1), Arrays.asList(Toby, Simba));


        System.out.println("Usuario");
        Usuario user = new Usuario(40471317, "Camilo", Arrays.asList(serie1, serie2));

        System.out.println("Ha visto: " + String.valueOf(user.cantidadCapitulosVistos()) + " capitulos");


        try {
            System.out.println("Continuar capitulo...");
            user.verCapitulo(serie2);
            System.out.println("Ha visto: " + String.valueOf(user.cantidadCapitulosVistos()) + " capitulos");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
