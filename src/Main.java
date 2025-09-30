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
                        "A) 1950", "B) 1954", "C) 1958", "D) 1962", "E) 1970", "C" )
        };

        int pontuacao = 0;
        for (Questao q : quiz) {
            q.escrevaQuestao();
            String resposta = q.leiaResposta();
            if (q.isCorreta(resposta)) {
                pontuacao++;
            }
        }

        System.out.println("Fim do quiz! Você acertou " + pontuacao + " de " + quiz.length + " questões.");
    }
}
