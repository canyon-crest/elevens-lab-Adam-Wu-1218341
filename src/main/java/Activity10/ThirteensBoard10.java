package Activity10;
import java.util.List;
import java.util.ArrayList;

public class ThirteensBoard10 extends Board10 {

    private static final int BOARD_SIZE = 10;

    private static final String[] RANKS =
        {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

    private static final String[] SUITS =
        {"spades", "hearts", "diamonds", "clubs"};

    private static final int[] POINT_VALUES =
        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

    public ThirteensBoard10() {
        super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
    }

    @Override
    public boolean isLegal(List<Integer> selectedCards) 
    {
        if (selectedCards.size() == 1) 
        {
            return containsKing(selectedCards);
        } 
        
        else if (selectedCards.size() == 2) 
        {
            return containsPairSum13(selectedCards);
        } 
        
        else 
        {
            return false;
        }
    }

    @Override
    public boolean anotherPlayIsPossible() 
    {
        List<Integer> cIndexes = cardIndexes();
        return containsPairSum13(cIndexes) || containsKing(cIndexes);
    }

    private boolean containsPairSum13(List<Integer> selectedCards) 
    {
        for (int sk1 = 0; sk1 < selectedCards.size(); sk1++) 
        {
            int k1 = selectedCards.get(sk1).intValue();
            
            for (int sk2 = sk1 + 1; sk2 < selectedCards.size(); sk2++) 
            {
                int k2 = selectedCards.get(sk2).intValue();
                
                if (cardAt(k1).pointValue() + cardAt(k2).pointValue() == 13) 
                {
                    return true;
                }
            }
        }
        
        return false;
    }

    private boolean containsKing(List<Integer> selectedCards) 
    {
        for (Integer kObj : selectedCards) 
        {
            int k = kObj.intValue();
            
            if (cardAt(k).rank().equals("king")) 
            {
                return true;
            }
        }
        
        return false;
    }
}
