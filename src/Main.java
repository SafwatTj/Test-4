/*
получает строку, в которой указан список всех клиентов банка и в скобках остаток на счете. Примерно так:
j.jack (1950.0);h.john (11820.30);k.nick (0.0);
 */


public class Main {
    public static void main(String[] args) {
        //Account[] accounts = null;
        Account[] accounts = new Account[7];
        accounts[0] = new Account("DE213255516",1000.0, new Person("Elena", "Sokolova", 20));
        accounts[1] = new Account("DE213255517",11234.5, new Person("Jack", "Johnson", 23));
        accounts[2] = new Account("DE213255518",8172.0, new Person("Nick", "Nickson", 26));
        accounts[3] = new Account("DE213255519",62010.1, new Person("Mike", "Jackson", 10));
        accounts[4] = new Account("DE213255520",14.0, new Person("Georg", "Loan", 62));
        accounts[5] = new Account("DE213255521",281.0, new Person("Irina", "Rome", 18));
        accounts[6] = new Account("DE213255522",543.0, new Person("Svetlana", "Ivanova", 25));


        System.out.println(getAccountsString(accounts));
        System.out.println(getClientsString(accounts));

    }
    public static String getAccountsString(Account[] accounts){
        if (accounts==null || accounts.length==0){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < accounts.length ; i++) {
            if(accounts[i]!=null) {
                sb.append(accounts[i].getIban()).append(';');
            }
        }

        sb.setLength(sb.length()-1);
        return  sb.toString();
    }

    public static String getClientsString(Account[] accounts){
        if (accounts==null || accounts.length==0){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < accounts.length ; i++) {
            if (accounts[i]!=null) {
                sb.append(accounts[i].ownerBalanceToString()).append(';');
            }
        }
        sb.setLength(sb.length()-1);
        return  sb.toString();
    }
}