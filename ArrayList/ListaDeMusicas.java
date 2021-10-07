import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

public class ListaDeMusicas {
    public static void main(String[] args) {
        // generics
        // polimorfismo paramético
        List<Musica> musicas = new ArrayList<>();
        int op;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(
                    "1 - Inserir música \n2 - Avaliar música \n3 - Ver lista de músicas ordenada\n0 - Sair"));
            switch (op) {
                case 1:
                    // pegar o titulo da musica
                    String tituloMusica = JOptionPane.showInputDialog("Digite o título da musica");
                    // construir um obj do tipo Musica
                    Musica novaMusica = new Musica(tituloMusica);
                    // adicionar no arrayList
                    musicas.add(novaMusica);
                    // confirmar insercao
                    JOptionPane.showMessageDialog(null, String.format("Ok, música %s inserida", tituloMusica));
                    break;
                case 2:
                    String tituloMusicaAvaliar = JOptionPane.showInputDialog("Qual música deseja avaliar? ");
                    int nota = Integer.parseInt(JOptionPane.showInputDialog("Qual a nota? "));
                    int i;
                    for (i = 0; i < musicas.size(); i++) {
                        Musica m = musicas.get(i);
                        if (tituloMusicaAvaliar.equals(m.getTitulo())) {
                            m.setAvaliacao(nota);
                            JOptionPane.showMessageDialog(null,
                                    String.format("Ok, música %s avaliada", tituloMusicaAvaliar));
                            break;
                        }
                    }
                    if (i == musicas.size())
                        JOptionPane.showMessageDialog(null,
                                String.format("A música %s não encontrada na coleção", tituloMusicaAvaliar));
                    break;
                case 3:
                    // Collections.sort(musicas);
                    Collections.sort(musicas, Collections.reverseOrder());
                    JOptionPane.showInputDialog(null, musicas);
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Até logo");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                    break;
            }
        } while (op != 0);
    }
}