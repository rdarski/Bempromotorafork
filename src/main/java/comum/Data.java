package comum;

import java.time.LocalDateTime;


public class Data {

    private LocalDateTime conteudo;

    private Data(LocalDateTime localDateTime){
        this.conteudo = localDateTime;
    }

    public static Data hoje(){
        return new Data(LocalDateTime.now());
    }

    public static Data em(int dia, int mes, int ano) {
        return new Data(LocalDateTime.of(ano, mes, dia, 0, 0));
    }

    public static Data em(int dia, int mes, int ano, int hora, int minutos) {
        return new Data(LocalDateTime.of(ano, mes, dia, hora, minutos));
    }

    public LocalDateTime getConteudo() {
        return conteudo;
    }
}
