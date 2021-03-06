package com.valhallagame.friendserviceclient.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InviteData {
	String senderDisplayCharacterName;
	String senderDisplayUsername;
	String receiverDisplayCharacterName;
	String receiverDisplayUsername;
}
