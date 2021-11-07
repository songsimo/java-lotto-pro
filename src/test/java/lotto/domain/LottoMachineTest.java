package lotto.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LottoMachineTest {

    @Test
    @DisplayName("입력 금액만큼 로또 생성")
    public void getLottoListTest() {
        LottoMachine machine = new LottoMachine();
        Money money = new Money(5000);

        int actualSize = machine.getLottoList(money).size();

        assertThat(actualSize).isEqualTo(5);
    }

}