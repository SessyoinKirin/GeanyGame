import java.util.Scanner;
public class JacobBuyao {
	
	public static void main (String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Scanner leia = new Scanner(System.in);
		int escolha;
		char desejo;
		String nome;
		
		System.out.println("Please choice your champion: \n1 - Jackob\n2 - Awei");
		escolha = ler.nextInt();
		if(escolha %2 == 1){//jacob lane
			System.out.println();
			System.out.println("Jackob, loading...");
			System.out.println("Voce esta como sempre, deixou o cabelo arrumadinho, raspou bigodinho,\ne agora voce deseja: \n1 - ir ao Lan House\n2 - ficar em casa assistindo Netflix");
			escolha = ler.nextInt();
			if(escolha %2 == 1){//main lane
				System.out.println();
				System.out.println("Voce comprou pao e veio ao Lan House que sempre ia,\nlogou no Genshin para ver se pega Ayaka de sorte,\nno seu lado sentou dois jovens de ensino medio falando alto chamando seu atencao toda,\nvoce vai: \n1 - muda de lugar\n2 - dar uma licao neles");
				escolha = ler.nextInt();
				if(escolha %2 == 1){//other final
					System.out.println();
					System.out.println("Parabens! Voce concluiu a conquista de \"ninguem sera sofrido!!\"");
					}else{//main lane
						System.out.println();
						System.out.println("Voce saiu da Lan House, esperando eles cairem em sua armadilha\nfinalmente, eles deixaram da Lan House, um que chamado Awei reclamou que esta com fome e nao quer voltar para casa\nnessa hora, chegou sua ideia: \nVoce chegou perto deles, diz\nJackob: E--ei, me desculpe, eu escutei que voces estao com fome, eu tenho um pao aqui, toma, podem comer");
						System.out.println("Awei recebeu sua oferta e comecou consumir,\nVoce se representou,\n\nJackob: Meu nome eh Jackobosta, eu tambem sempre passo aqui e podem me chamar de Jackob\n\nAwei: Ola Jackob\n");
						System.out.println("Jackob: Olah, eu moro sozinho, minha casa eh muito grande, minha casa eh bem-vinda para voces virem brincar, se quiserem podem ate passar noite la\nMas sua estranharam eles, entao voce continuou,\nJackob: eu sempre ajudo as pessoas que fujam da casa, se voces nao querem vir nao tem problema, mas se quiseram vir, daqui a pouco posso levar voces para supermercado para comprar salgadinhos");
						System.out.println("\nAwei:  Tem salgadinhos para comer Bin, deve ser daora, vamos la poh\n\nBin: Ah, pode ser\nVoces chegaram ao supermercado, enquando eles estao escolhendo o que eles querem, voce tambem esta escolhendo... De repente um pacote de cerveja chamou sua atencao, Voce deseja leva-lo?\n1 - Sim\n2 - Nao");
						escolha = ler.nextInt();
						if(escolha %2 == 1){//main lane
							System.out.println();
							System.out.println("Voces conversaram muito, os jovens consumiram a bebida alcoolica e Bin ja esta bebado\n(Sistema: Venda proibida aos menores)\nJackob: Voce ve esse Bin aqui, haha, bebeu duas latas e ja esta bebado\nAwei: Esse Binbin eh fraco mesmo hehe\n\nVoce olhou para Awei, diz\n\nJackob: Voce deve ser bom pra falar isso hein\nAwei: Claro, sou bom mesmo, nem fico bebado\n\nJackob: Nem fica bebado...\nVoce colocou nao na coxa dele,\nJackob: Oia so, que corpo fortinho, gostei");
							System.out.println("Awei ja quase bebado: O-oloco Jackob, o que que voce quer?\nJackob com sorriso: O que eu quero? No meu quarto tem uns baguios daoras, ainda pode te ensina a Deng Dua Lang\n\nAwei: Deng Dua Lang??\nJackob: Vamos la, vamos la que voce descobre");
							System.out.println("Voce mostrou conteudo maior para Awei,\nAwei: Oloco Jackob, que isso??\nJackob: Ala voce ficou com rosto vermelho, deixa eu dar uma olhada no voce ai\n\nAwei: Pa-para Jackob, para com isso\nAwei te empurrou e voce ficou irritado\nJackob: escuta, deixa eu dar uma olhada\nAwei: Nao quero!!\n\nVoce deu um soco na cara dele, nos choros dele voce virou senhor dos anais\n(Pressione Enter para continuar)");
							nome = leia.nextLine();
							System.out.println("Parabens, voce concluiu o final verdadeiro e a conquista de \"JacobBuYaoLa\"!!\nNesse jogo com intencao de fazer as pessoas prestarem atencao\nnas coisas como \"prevencao de agressao sexual\" ou\n\"meninos que abusam sexualmente de meninos\"\nEspero que posso diminuir esse tipo de trajedia nesse sociedade.");
							}else{//lane safe
								System.out.println();
								System.out.println("Voces conversaram muito, e no final da festa voce educou eles a falar baixo no espaco publico e ser educado.(Pressione Enter to continue)");
								nome = leia.nextLine();
								System.out.println("Parabens! Voce concluiu a conquista de \"ninguem sera sofrido!!\"");
								}						
						}
				
				}else{//other lane
					System.out.println();
					System.out.println("Voce passou o dia inteiro assistindo filme e acabou esquecendo de comemorar o aniversario da sua namorada\n(Pressione Enter para continuar)");
					nome = leia.nextLine();
					System.out.println("Parabens! Voce concluiu a conquista de \"perdi o namoro assistindo filme!!\"");
					}
			}else{//awei lane
				System.out.println();
				System.out.println("Awei, Loading...\nVoce esta em casa jogando, no momento de climax, chegou sua avo,\nAvo: Awei voce esta jogando de novo, pare um pouco, voce pode estudar?\n1 - parar de jogar e vai estudar\n2 - continua jogando");
				escolha = ler.nextInt();
				if(escolha %2 == 1){//safe lane
					System.out.println();
					System.out.println("Voce focou no estudo e assim voce passou para direito da UFRJ\n(Pressione Enter para continuar)");
					nome = leia.nextLine();
					System.out.println("Parabens! Voce concluiu a conquista de \"ninguem sera sofrido!!\"");
					}else{//main lane
						System.out.println();
						System.out.println("Voce nao quer ligar para a avo e continuou jogando\nAvo: Eu estou falando contingo voce ouviu? Awei? Awei?\nAwei: Para, voce eh chata\n\nAvo: Eu so chamei voce para estudar, e voce ja me chamou de chata, e eu so desejo voce possa estudar para Enem...\nSua avo nem terminou de falar, seu personagem do jogo morreu\nVoce ficou brava: ah, morreu, eh culpa sua!\ne saiu da casa convitando seu amigo Bin");
						System.out.println("Chegou no Lan House com Bin, voces logaram para League of Legends,\nmas voces sao muito ruins, ficaram 1/21/1,\nVoces ficaram cada vez mais irritado e comecou gritar, mesmo assim no final voces perderam\nVoces se cansaram e decidiu sair do Lan House");
						System.out.println("Awei: Ae Bin, to com fome cara, bora pra sua casa pra comer\nBin: Ue, por que voce nao vai voltar pra sua casa?\n\nAwei: Eu nao, minha avo e chata, vamos pra sua casa\nBin: nem da, meu pai me quebra depois\n\nEnquanto voces decindindo veio um cara de aparencia de 25 anos convitou voces para ir brincar na casa dele\nVoce iria?\n1 - Sim\n2 - Nao");
						escolha = ler.nextInt();
						if(escolha %2 == 1){//main lane
							System.out.println();
							System.out.println("Voce e seu amigo seguiram um cara chamado Jackob compraram um monte de coisa e veio ao casa dele\nNessa hora, voce reparou as latas de cervejas (Sistema: venda proibida aos menores) , voce deseja tomar?\n1 - Sim\n2 - Nao");
							escolha = ler.nextInt();
							if(escolha %2 ==1){//main lane
								System.out.println();
								System.out.println("Voce bebeu muito e ficou bebado, e acabou caindo na armadilha do Jackob\n(Pressione Enter para continuar)");
								nome = leia.nextLine();
								System.out.println("Parabens, voce concluiu a conquista de \"final verdadeiro\"!!\nNesse jogo com intencao de fazer as pessoas prestarem atencao\nnas coisas como \"prevencao de agressao sexual\" ou\n\"meninos que abusam sexualmente de meninos\"\nEspero que posso diminuir esse tipo de trajedia nesse sociedade.");
								
								}else{
									System.out.println();
									System.out.println("Voces conversaram muito e no final Jackob deu licao para voces de que eh errado gritar no espaco publico (Pressione Enter para continuar).");
									nome = leia.nextLine();
									System.out.println("Parabens! Voce concluiu a conquista de \"ninguem sera sofrido!!\"");
									}
							}else{
								System.out.println();
								System.out.println("Voce rejeitou o cara estranho, voltou pra casa e pediu desculpa pra avo(Pressione Enter para continuar).");
								nome = leia.nextLine();
								System.out.println("Parabens! Voce concluiu a conquista de \"ninguem sera sofrido!!\"");
								}
						}
				}
		
	}
}

