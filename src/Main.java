public class Main {
    public static void main(String[] args) {

        System.out.println("Bem vindo ao quiz");
        System.out.println("O tema das perguntas são sobre os esportes");
        System.out.println("--------------------");
        Questao[] quiz = {
                new Questao("Qual país sediou a Copa do Mundo de 2014?",
                        "A) África do Sul", "B) Alemanha", "C) Brasil", "D) Rússia", "E) França", "C"),

                new Questao("Em que esporte se destacou Michael Jordan?",
                        "A) Tênis", "B) Natação", "C) Basquete", "D) Atletismo", "E) Futebol", "C"),

                new Questao("Qual é o país de origem do beisebol?",
                        "A) Japão", "B) Estados Unidos", "C) Cuba", "D) México", "E) Canadá", "B"),

                new Questao("Em que ano o Brasil conquistou seu primeiro título de Copa do Mundo de futebol?",
                        "A) 1950", "B) 1954", "C) 1958", "D) 1962", "E) 1970", "C" ),

                new Questao("Quantos títulos mundiais de Fórmula 1 Ayrton Senna conquistou?",
                        "A) 1", "B) 2", "C) 3", "D) 4", "E) 5", "C"),

                new Questao("Quantos jogadores compõem uma equipe titular de voleibol em quadra?",
                        "A) 5", "B) 6", "C) 7", "D) 11", "E) 12", "B"),

                new Questao("Qual é o tipo de superfície tradicional do torneio de tênis de Roland Garros?",
                        "A) Grama", "B) Cimento", "C) Saibro", "D) Carpete", "E) Madeira", "C"),

                new Questao("Em qual modalidade esportiva o jamaicano Usain Bolt se consagrou?",
                        "A) Natação", "B) Salto em distância", "C) Maratona", "D) Atletismo (Velocidade)", "E) Ciclismo", "D"),

                new Questao("Qual país venceu a Copa do Mundo de Futebol Masculino de 2022?",
                        "A) França", "B) Brasil", "C) Argentina", "D) Croácia", "E) Marrocos", "C"),

                new Questao("Como é chamado o objeto rebatido no Badminton?",
                        "A) Bola", "B) Disco", "C) Peteca", "D) Dardo", "E) Puxador", "C"),

                new Questao("Qual é a distância oficial de uma maratona?",
                        "A) 10 km", "B) 21 km", "C) 30 km", "D) 40 km", "E) 42,195 km", "E"),

                new Questao("Qual é o país de origem da arte marcial Judô?",
                        "A) China", "B) Coreia do Sul", "C) Japão", "D) Tailândia", "E) Mongólia", "C"),

                new Questao("O time 'Golden State Warriors' pertence a qual liga esportiva?",
                        "A) NFL", "B) MLB", "C) NHL", "D) NBA", "E) MLS", "D"),

                new Questao("Qual cidade brasileira sediou os Jogos Olímpicos de 2016?",
                        "A) São Paulo", "B) Brasília", "C) Belo Horizonte", "D) Rio de Janeiro", "E) Salvador", "D"),

                new Questao("O Super Bowl é o evento final de qual esporte?",
                        "A) Beisebol", "B) Futebol Americano", "C) Rúgbi", "D) Basquete", "E) Hóquei no Gelo", "B"),

                new Questao("Muhammad Ali foi uma lenda mundial de qual esporte?",
                        "A) Boxe", "B) MMA", "C) Caratê", "D) Luta Livre", "E) Muay Thai", "A"),

                new Questao("Quantos jogadores de linha (sem contar o goleiro) tem um time de Futsal?",
                        "A) 3", "B) 4", "C) 5", "D) 6", "E) 7", "B"),

                new Questao("Michael Phelps é o maior medalhista olímpico da história de qual esporte?",
                        "A) Atletismo", "B) Ginástica Artística", "C) Remo", "D) Natação", "E) Saltos Ornamentais", "D"),

                new Questao("Em qual esporte a brasileira Rayssa Leal, a 'Fadinha', ganhou destaque mundial?",
                        "A) Ginástica", "B) Skate", "C) Surfe", "D) Vôlei de Praia", "E) Tênis de Mesa", "B")
        };
        int pontuacao = 0;
        for (Questao q : quiz) {
            q.escrevaQuestao();
            String resposta = q.leiaResposta();
            if (q.isCorreta(resposta)) {
                pontuacao++;
            }
        }

        double porcentagem = ((double) pontuacao / quiz.length) * 100;
        double nota = ((double) pontuacao / quiz.length) * 10;

        System.out.println("---------------");
        System.out.println("FIM DO QUIZ!");
        System.out.println("Você acertou " + pontuacao + " de " + quiz.length +  " questões.");
        System.out.println("Fim do quiz! Você acertou " + pontuacao + " de " + quiz.length + " questões.");

        System.out.printf("Sua porcentagem  de acerto foi: %.2f%%n", porcentagem);
        System.out.printf("Sua nota (média) foi: %.1f de 10.0%n", nota);
        System.out.println("---------------------");

    }
}
