package lotto.domain;

import java.util.Collections;
import java.util.List;

public class Ledger {
	private LottoPrice lottoPrice;
	private List<List<String>> manualLottoList;

	public Ledger(LottoPrice lottoPrice, List<List<String>> manualLottoList) {
		this.lottoPrice = lottoPrice;
		this.manualLottoList = manualLottoList;
	}

	public boolean isValidOrder() {
		return lottoPrice.isValidOrder(manualLottoList.size());
	}

	public List<List<String>> getManualLottoList() {
		return Collections.unmodifiableList(manualLottoList);
	}
}
