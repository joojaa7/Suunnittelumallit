package A12;

public class Main {

    public static void main(String[] args){

        User pekka = new User("Pekka");
        User karoliina = new User("Karoliina");
        Library library = new Library();

        library.addDocument("Dokumentin sisältö", "Dokumentin nimi", pekka, true);
        library.addDocument("Julkinen dokumentti", "Julkinen nimi", pekka, false);
        library.addDocument("Suojattu dokumentti", "Suojattu nimi", karoliina, true);

        DocumentInterface document;
        document = library.getDocument("Dokumentin nimi");
        String content;
        try {
            content = document.getContent(pekka);
            System.out.println(content);
            System.out.println(document.getCreationDate());
            document = library.getDocument("Julkinen nimi");
            System.out.println(document.getContent(karoliina));
            document = library.getDocument("Suojattu nimi");
            System.out.println(document.getContent(karoliina));
        } catch (AccessDeniedException e){
            System.out.println(e.getMessage());
        }

    }

}
