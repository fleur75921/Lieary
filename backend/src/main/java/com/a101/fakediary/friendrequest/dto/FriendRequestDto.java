package com.a101.fakediary.friendrequest.dto;

import com.a101.fakediary.friendrequest.entity.FriendRequest;
import com.a101.fakediary.friendrequest.repository.FriendRequestRepository;
import com.a101.fakediary.member.entity.Member;
import com.a101.fakediary.member.repository.MemberRepository;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FriendRequestDto {
    private Long senderId;
    private Long receiverId;
}
