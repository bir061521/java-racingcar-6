package racingcar.enumType;

import racingcar.util.EnumUtil;

public enum ExceptionMessage implements EnumUtil<String, String> {//enum항목
    BLANK_MESSAGE("%s은(는) 빈 값이 들어올 수 없습니다."),
    LENGTH_MESSAGE("%d글자를 초과혔습니다."),
    INPUT_MESSAGE("입력 중에 예기치 못한 오류가 발생하였습니다.예외메시지: %s"),
    TYPE_MESSAGE("%s은(는)숫자만 입력할 수 있습니다."),
    RANGE_MESSAGE("%d 이상의 값을 입력해 주세요."),
    DUPLICATE_MESSAGE("중복된 값을 입력할 수 없습니다."),
    NO_RESOURCE_MESSAGE("%s 가 존재하지 않습니다.");

    private final String message;//문자열 필드 -> 필드는 객체의 상태를 저장하는 변수,객체의 데이터를 담는 역할

    ExceptionMessage(final String message){//생성자 -> 각 enum항목의 메시지 초기화
        this.message = message;
    }

    @Override
    public String getKey() {//enumUtil인터페이스 구현 ->enum상수의 이름과, 메시지 반환
        return name();
    }

    @Override
    public String getValue() {
        return message;
    }
}
