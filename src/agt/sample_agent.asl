// crenças iniciais
pos(0).

// meta inicial
!start.

// planos

+!start : true
  <- .print("Iniciando agente...");
     .wait(1000);
     !agir.

+!agir : pos(P) & dirty(P)
  <- .print("Sala ", P, " está suja. Limpando...");
     clean;
     .wait(1000);
     !agir.

+!agir : pos(0)
  <- right;
     .wait(1000);
     !agir.

+!agir : pos(1)
  <- left;
     .wait(1000);
     !agir.

+dirty(P)
  <- .print("Percebi sujeira na sala ", P).

-!agir.
