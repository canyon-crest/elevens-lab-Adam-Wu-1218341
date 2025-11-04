package Activity10;

public class ThirteensGUIRunner10 
{
    public static void main(String[] args) 
    {
        Board10 board = new ThirteensBoard10();
        CardGameGUI10 gui = new CardGameGUI10(board);
        gui.displayGame();
    }
}
