import java.util.Random;
import cartago.*;

public class Rooms extends Artifact {

	private boolean rooms[] = null;
	private int robotAt = 0;
	private Random rnd = new Random(System.currentTimeMillis());


	void init(int numberOfRooms) {
		rooms = new boolean[numberOfRooms];
		defineObsProperty("at", 0);

		for(int i=0; i<numberOfRooms; i++)
			rooms[i] = false;
		execInternalOp("run");
	}
	@INTERNAL_OPERATION
	void run()
	{
		while (true) {
			if(rnd.nextDouble() <= 0.7)
				rooms[rnd.nextInt(rooms.length)]=true;
			await_time(4000);	
			
		}
	}
@OPERATION 
void goLeft() { 
    if (robotAt - 1 >= 0) { 
        robotAt--; 
        getObsProperty("at").updateValue(robotAt); 
        signal("dirty"); 
        System.out.println("O robô se moveu para a sala " + robotAt + " (direção: esquerda)."); 
    } else { 
        signal("border"); 
        System.out.println("O robô alcançou o limite esquerdo e não pode se mover para mais salas."); 
    } 
} 

@OPERATION 
void goRight() { 
    if (robotAt + 1 < rooms.length) { 
        robotAt++; 
        getObsProperty("at").updateValue(robotAt); 
        signal("dirty"); 
        System.out.println("O robô se moveu para a sala " + robotAt + " (direção: direita)."); 
    } else { 
        signal("border"); 
        System.out.println("O robô alcançou o limite direito e não pode se mover para mais salas."); 
    } 
} 

@OPERATION 
void clean() { 
    rooms[robotAt] = false; 
    System.out.println("A limpeza foi concluída na sala " + robotAt + "."); 
} 
}