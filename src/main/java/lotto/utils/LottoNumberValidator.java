package lotto.utils;

import static java.util.stream.Collectors.*;
import static lotto.constant.ErrorMessage.*;
import static lotto.constant.LottoConstant.*;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import lotto.domain.LottoNumber;

public class LottoNumberValidator {

	private LottoNumberValidator() {}

	public static void validateLottoNumber(int number) {
		if (isValidLottoNumber(number)) {
			return;
		}

		throw new IllegalArgumentException(MessageBuilder.build(INVALID_LOTTO_NUMBER, number));
	}

	public static boolean isValidLottoNumber(int number) {
		return LOTTO_NUMBER_MIN <= number && number <= LOTTO_NUMBER_MAX;
	}

	public static void validateLottoNumbers(List<LottoNumber> lottoNumbers) {
		List<Integer> numbers = lottoNumbers.stream()
											.map(LottoNumber::getNumber)
											.collect(toList());
		Set<LottoNumber> lottoNumbersSet = new LinkedHashSet<>(lottoNumbers);

		if (lottoNumbersSet.size() != VALID_LOTTO_NUMBER_COUNT) {
			throw new IllegalArgumentException(MessageBuilder.build(DUPLICATED_LOTTO_NUMBER, numbers));
		}
	}
}