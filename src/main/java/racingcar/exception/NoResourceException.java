package racingcar.exception;

public class NoResourceException extends GlobalException{//공백에 대한 커스텀 예외클래스
    public NoResourceException(final String message){
        super(message);
    }
}
