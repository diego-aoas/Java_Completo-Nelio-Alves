package Video173_CriandoExcecoesPersonalizadas.model.exceptions;

import java.io.Serial;

public class DomainException extends RuntimeException {

    @Serial
    //private static final long serialVersionUID = 4427665861608824219L;
    private static final long serialVersionUID = 1L;

    public DomainException (String msg){
        super(msg);
    }
}
