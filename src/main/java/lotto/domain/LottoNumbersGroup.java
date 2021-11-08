package lotto.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LottoNumbersGroup {
    private final List<LottoNumbers> lottoNumbersGroup;

    public LottoNumbersGroup(BuyAmount buyAmount) {
        this.lottoNumbersGroup = generateRandomLottoNumbers(buyAmount.getAmount());
    }

    public LottoNumbersGroup(String[] myLottoNumbers) {
        this.lottoNumbersGroup = generateManualLottoNumbers(myLottoNumbers);
    }

    public LottoNumbersGroup(List<LottoNumbers> myLottoNumbers) {
        this.lottoNumbersGroup = myLottoNumbers;
    }

    protected List<LottoNumbers> generateRandomLottoNumbers(int amount) {
        List<LottoNumbers> resultLottoNumbers = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            resultLottoNumbers.add(new LottoNumbers());
        }

        return resultLottoNumbers;
    }

    private List<LottoNumbers> generateManualLottoNumbers(String[] myLottoNumbers) {
        List<LottoNumbers> resultLottoNumbers = new ArrayList<>();
        for (String lottoNumbers : myLottoNumbers) {
            resultLottoNumbers.add(new LottoNumbers(lottoNumbers));
        }

        return resultLottoNumbers;
    }

    public List<LottoNumbers> getLottoNumbersGroup() {
        return lottoNumbersGroup;
    }

    public LottoResults getLottoResults(LottoNumbers prizeLottoNumbers) {
        List<LottoResult> lottoResults = new ArrayList<>();
        for (LottoNumbers lottoNumbers : lottoNumbersGroup) {
            LottoResult lottoResult = lottoNumbers.getLottoResult(prizeLottoNumbers);
            lottoResults.add(lottoResult);
        }

        return new LottoResults(lottoResults);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LottoNumbersGroup)) return false;
        LottoNumbersGroup that = (LottoNumbersGroup) o;
        return Objects.equals(lottoNumbersGroup, that.lottoNumbersGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lottoNumbersGroup);
    }
}