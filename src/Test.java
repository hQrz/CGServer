import com.ricky.model.Message;
import com.ricky.model.Position;


public class Test {
    public static void main(String[] args)
    {
        Position first = new Position(1, 2, 10, Position.Type.CARD);
        Position second = new Position(1, 2, 11, Position.Type.CARD);

        Message posMessage = new Message(Message.Type.PLAY, "ricky",first, second);

        System.out.println(posMessage.toJSON());

        Message next = new Message(posMessage.toJSON());

        System.out.println(next.toJSON());
    }
}
