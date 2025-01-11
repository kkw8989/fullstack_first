package com.back4.dto.payment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreatePaymentHistoryDTO {

    private String email; // 회원 이메일
    private Long paymentId; // 결제 ID
    private String actionType; // 내역 유형
    private String memo; // 추가 메모
}
