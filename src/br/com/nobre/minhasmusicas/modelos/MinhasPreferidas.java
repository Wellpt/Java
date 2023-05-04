package br.com.nobre.minhasmusicas.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio) {
        if (audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + " é considerado sucesso Absoluto e preferido por todos");
        }else {
            System.out.println(audio.getTitulo() + " tambem é uma otima opção e as pessoas estão curtindo");
        }
    }
}
