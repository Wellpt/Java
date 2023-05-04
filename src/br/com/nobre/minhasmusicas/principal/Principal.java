package br.com.nobre.minhasmusicas.principal;

import br.com.nobre.minhasmusicas.modelos.MinhasPreferidas;
import br.com.nobre.minhasmusicas.modelos.Musica;
import br.com.nobre.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Olhos Certos");
        minhaMusica.setArtista("Detonautas");

        for (int i = 0; i < 1000 ; i++) {
            minhaMusica.reproduz();
        }
        for (int i = 0; i <50 ; i++) {
            minhaMusica.curte();
        }
        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Jornalismo");
        meuPodcast.setApresentador("William Booner");
        meuPodcast.setDescricao("Informações RJ");

        for (int i = 0; i <5000; i++) {
            meuPodcast.reproduz();
        }
        for (int i = 0; i <1000; i++) {
            meuPodcast.curte();
        }
        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }
}
