class Main {

    public static void main(String[] args) {
        // hacer string un int
        int a = Integer.parseInt(args [0]); //_int variable primitiva/  Integer clase con atributos y metodos
        int b = Integer.parseInt(args [1]); // metodo string a integer

        //
        SumaDosNumeros obj = new SumaDosNumeros(); // instacia de la clase x -> "SumaDosNumeros"     / Separa el espacio de memoria
        System.out.println(obj.suma(a, b));
        
    }
}
