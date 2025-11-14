import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataHora {
    // Obter a data e hora atuais
    LocalDateTime dataHoraAtual = LocalDateTime.now();

    String formatDataHora(){
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataHoraFormatada = dataHoraAtual.format(formatador);
        // Formatar em um padrão específico (ex: dd/MM/yyyy HH:mm:ss)
        return dataHoraFormatada;
    }
}
