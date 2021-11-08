package lotto;

import lotto.domain.Lotto;
import lotto.domain.LottoBundle;
import lotto.domain.LottoResult;
import lotto.domain.Money;
import lotto.view.InputView;
import lotto.view.LottoView;

public class LottoGame {

    public void play() {
        Money money = InputView.getUserMoney();

        LottoBundle lottoBundle = money.buyAllRandomLotto();

        LottoView.printLottoBundleStatus(lottoBundle);

        Lotto winningLotto = InputView.getWinningLotto();

        LottoResult lottoResult = lottoBundle.getLottoResult(winningLotto);

        LottoView.printResult(lottoResult);
    }
}