import java.io.IOException;

class HelpClassDemo {
    public static void main(String[] args) throws IOException {
        Help help = new Help();
        char choice, ignore;

        for (; ; ) {
            do {
                help.showMenu();
                choice = (char) System.in.read();
                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (!help.isValid(choice));
            if (choice == 'q') break;
            System.out.println("\n");

            help.helpOn(choice);
        }
    }
}

class Help {
    public void helpOn(int what) {
        switch (what) {
            case '1':
                System.out.println("Instruction conditional if:\n");
                System.out.println("if(conditional) instruction;");
                System.out.println("else instruction ;");
                break;
            case '2':
                System.out.println("Instruction selection switch:\n");
                System.out.println("switch(expression) { ");
                System.out.println("case constant:");
                System.out.println("instruction");
                System.out.println("break;");
                System.out.println("}");
                break;
            case '3':
                System.out.println("Loop for:\n");
                System.out.println("for(initialization; conditional; iteration)");
                System.out.println("instruction;");
                break;
            case '4':
                System.out.println("Loop while:\n");
                System.out.println("while(conditional):\n");
                System.out.println("instruction;");
                break;
            case '5':
                System.out.println("Loop do-while:\n");
                System.out.println("do {");
                System.out.println("instruction;");
                System.out.println("} while (conditional);");
                break;
            case '6':
                System.out.println("Instruction break:\n");
                System.out.println("break; or break label;");
                break;
            case '7':
                System.out.println("Instruction continue:\n");
                System.out.println("continue; or continue label;");
                break;
        }
        System.out.println();
    }

    public void showMenu() {
        System.out.println("Information about syntax instructions:");
        System.out.println("    1. if");
        System.out.println("    2. switch");
        System.out.println("    3. for");
        System.out.println("    4. while");
        System.out.println("    5. do-while");
        System.out.println("    6. break");
        System.out.println("    7. continue");
        System.out.println("Choice the number instructions (or q to exit):");
    }

    public boolean isValid(int ch) {
        if (ch < '1' | ch > '7' & ch != 'q') return false;
        return true;
    }
}

