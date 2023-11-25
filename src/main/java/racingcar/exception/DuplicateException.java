package racingcar.exception;

public class DuplicateException extends GlobalException{//중복된 요소에 대한 커스텀 예외 클래스
    public DuplicateException(final String message){
        super(message);
    }
}
