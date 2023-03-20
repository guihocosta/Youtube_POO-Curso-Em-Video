public class Main {
    public static void main(String[] args) {
        Video v[] = new Video[2];
        v[0] = new Video ("The Mandalorian");
        v[1] = new Video("The Bad Batch");

        Espectador e[] = new Espectador[2];
        e[0] = new Espectador("Guilherme", new Data(15,4,2006), 'M', "guihocosta");
        e[1] = new Espectador("Jonathan", new Data(22,5,1998), 'M', "nick.costa");

        Visualizacao visu[] = new Visualizacao[2];
        visu[0] = new Visualizacao(e[0], v[0]);
        visu[1] = new Visualizacao(e[1], v[1]);

        System.out.println(visu[0].toString());
        System.out.println(visu[1].toString());
    }
}