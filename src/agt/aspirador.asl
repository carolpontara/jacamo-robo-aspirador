

!start.

/* Plans */

+!start: true
    <- makeArtifact("rooms", "Rooms",[2],ID);
    focus(ID);
    !searchTrash.

+!searchTrash <- .drop_all_intentions;
    !move;
    .wait(1000);
    !searchTrash.

+!move: at(X) & X == 0 
    <- .println("O robô está indo para a sala ", X + 1, " a partir da sala inicial."); 
    goRight. 

+!move: at(X) & X == 1 
    <- .println("O robô está retornando para a sala inicial a partir da sala ", X); 
    goLeft. 

+dirty: at(X) 
    <- .println("Sujeira detectada na sala ", X, ". Iniciando processo de limpeza."); 
    clean. 




{ include("$jacamo/templates/common-cartago.asl") }
{ include("$jacamo/templates/common-moise.asl") }

// uncomment the include below to have an agent compliant with its organisation
//{ include("$moise/asl/org-obedient.asl") }
