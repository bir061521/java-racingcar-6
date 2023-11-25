package racingcar.exception;

public class ConsoleException extends GlobalException {

    public ConsoleException(final String message){//IOException에 대해 wrapping한 커스텀 예외클래스
        super(message);
    }
}
