import javax.swing.JOptionPane;

public class Trabalho1 {
	public static void main(String[] args) {

		String Compartimentos[][] = new String[4][3];
		String Artistas[][] = new String[4][3];
		String Musicas[][] = new String[4][3];
		int Registro[][] = new int[4][3];

		Compartimentos[0][0] = "101";
		Compartimentos[0][1] = "102";
		Compartimentos[0][2] = "103";
		Compartimentos[1][0] = "201";
		Compartimentos[1][1] = "202";
		Compartimentos[1][2] = "203";
		Compartimentos[2][0] = "301";
		Compartimentos[2][1] = "302";
		Compartimentos[2][2] = "303";
		Compartimentos[3][0] = "401";
		Compartimentos[3][1] = "402";
		Compartimentos[3][2] = "403";

		Artistas[0][0] = "Kanye West";
		Artistas[0][1] = "Kanye West";
		Artistas[0][2] = "Kanye West";
		Artistas[1][0] = "Bon Jovi";
		Artistas[1][1] = "Bon Jovi";
		Artistas[1][2] = "Bon Jovi";
		Artistas[2][0] = "Ben Harper";
		Artistas[2][1] = "Ben Harper";
		Artistas[2][2] = "Ben Harper";
		Artistas[3][0] = "Jack Johnson";
		Artistas[3][1] = "Jack Johnson";
		Artistas[3][2] = "Jack Johnson";

		Musicas[0][0] = "Golddigger";
		Musicas[0][1] = "Homecoming";
		Musicas[0][2] = "Can't Tell Me Nothing";
		Musicas[1][0] = "It's My Life";
		Musicas[1][1] = "Living on a Prayer";
		Musicas[1][2] = "You Give Love a Bad Name";
		Musicas[2][0] = "Amen Omen";
		Musicas[2][1] = "Diamonds on The Inside";
		Musicas[2][2] = "Everything";
		Musicas[3][0] = "Upside Down";
		Musicas[3][1] = "Better Together";
		Musicas[3][2] = "Banana Pancakes";

		//1)Solicite ao usuário o número de vezes que a música foi pedida(TOCADA), a mensagem que aparece para o usuário deve seguir o seguinte modelo:
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 3; j++) {
				Registro[i][j] = (int) (Math.random()*31);
				System.out.print(Registro[i][j] + "\t");
			}
			System.out.println();
		}

		//2) Solicite ao usuário que informe um nome de um dos artista (STRING) e utilizando PESQUISA LINEAR mostre o número de músicas que este artista possui cadastrado no sistema da JUKEBOX.
		String artistaSelecionado = JOptionPane.showInputDialog(null, "Informe um artista para saber quantas músicas ele possui na jukebox.");
		int counter = 0;
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 3; j++) {
				if(Artistas[i][j].equals(artistaSelecionado))
					counter++;
			}
		}
		JOptionPane.showMessageDialog(null, "O artista possui " + counter + " músicas nesta jukebox.");

		//3) Mostre quantas vezes a máquina tocou músicas. Como cada música custa a moeda de R$ 1,00 , o dono deseja saber quantos reais tem em caixa.
		int totalMusicas = 0;
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 3; j++) {
				totalMusicas += Registro[i][j];
			}
		}
		JOptionPane.showMessageDialog(null, "A jukebox tocou " + totalMusicas + " músicas, portanto possui R$" + totalMusicas + " em caixa.");

		//4) Mostre o nome do artista, o número do compartimento e a música MAIS PEDIDA.
		int linha = 0, coluna = 0, musicaMaisTocada = 0;

		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 3; j++) {
				if(Registro[i][j] > musicaMaisTocada) {
					musicaMaisTocada = Registro[i][j];
					linha = i;
					coluna = j;
				}
			}
		}
		JOptionPane.showMessageDialog(null, "A música mais tocada é " + Musicas[linha][coluna] + " do artista " + Artistas[linha][coluna] + " que corresponde ao compartimento " + Compartimentos[linha][coluna] + ".");

	}
}