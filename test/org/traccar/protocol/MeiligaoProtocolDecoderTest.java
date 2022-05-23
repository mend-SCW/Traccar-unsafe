package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class MeiligaoProtocolDecoderTest extends ProtocolTest {

    @Test
    public void testDecode() throws Exception {

        MeiligaoProtocolDecoder decoder = new MeiligaoProtocolDecoder(new MeiligaoProtocol());

        verifyNull(decoder, binary(
                "24240012254748594772ff080002ffff0d0a"));

        verifyNull(decoder, binary(
                "242403fe254748594772ff99880242681100ffd8ffe000104a46494600010101000000000000ffdb004300080606070605080707070909080a0c140d0c0b0b0c1912130f141d1a1f1e1d1a1c1c20242e2720222c231c1c2837292c30313434341f27393d38323c2e333432ffdb0043010909090c0b0c180d0d1832211c213232323232323232323232323232323232323232323232323232323232323232323232323232323232323232323232323232ffc4001f0000010501010101010100000000000000000102030405060708090a0bffc400b5100002010303020403050504040000017d01020300041105122131410613516107227114328191a1082342b1c11552d1f02433627282090a161718191a25262728292a3435363738393a434445464748494a535455565758595a636465666768696a737475767778797a838485868788898a92939495969798999aa2a3a4a5a6a7a8a9aab2b3b4b5b6b7b8b9bac2c3c4c5c6c7c8c9cad2d3d4d5d6d7d8d9dae1e2e3e4e5e6e7e8e9eaf1f2f3f4f5f6f7f8f9faffc4001f0100030101010101010101010000000000000102030405060708090a0bffc400b51100020102040403040705040400010277000102031104052131061241510761711322328108144291a1b1c109233352f0156272d10a162434e125f11718191a262728292a35363738393a434445464748494a535455565758595a636465666768696a737475767778797a82838485868788898a92939495969798999aa2a3a4a5a6a7a8a9aab2b3b4b5b6b7b8b9bac2c3c4c5c6c7c8c9cad2d3d4d5d6d7d8d9dae2e3e4e5e6e7e8e9eaf2f3f4f5f6f7f8f9faffc000110801e0028003012100021101031101ffda000c03010002110311003f00f0cc679a5a977d84b517d69474a98f615930e3a52edabea50b8a5c54c9e84c9f4178a5c7b50ad617bbd45a5c00287b16d681f852f5eb44aefde32e5bbb0ec0a38eb4d36d9a48753f150f4d5916f74318a70ad5dd8dc75168ed53ccadee8e239452f434afd10921719a7639aad56854ac3c0a5a98cfc8971d6c85a7f6a65ad07e29f8a1b10fc52ff153f405a6e48053f145f4b31abc5928e9cd4cabd3152f4d01ab6a4ca2a50a33509d9d809d56a50b56a7a87c24cbd6a655a2510ea4aa2a555a953b30255a92a80945498a435b8f1520a3d043b14e02974d40752d37a20490b4b40076a2a760129298094949e8030d368527b8c6530d4ddc84861a6353b8119a69e94b402334ca6e5a0861eb4c22b3d876184530d56e85623c506b27cd719e494bdabadab6a2d43e945227588a7d29739e69d92dc7d4703476cd569612d472b6452d4fbb61d828c734d6eac263fb52d539caf7634c55f6a2a1b8885a78e949db94528bd90539714dbea69bea2e7d29d9c51b19db4b053c75abffff0d0a"));

        verifyPosition(decoder, binary(
                "242400716578902405843299553136323533332e3937382c412c343632332e313137392c4e2c30373932342e323437312c572c303030302c3030302c3139313231372c2c2a31437c31312e357c3139347c303030307c313139322c303030307c3835383030307c30303331343809540d0a"));

        verifyPosition(decoder, binary(
                "242400716578902405843299553136323533332e3937382c412c343632332e313137392c4e2c30373932342e323437312c572c303030302c3030302c3139313231372c2c2a31437c31312e357c3139347c303030307c313139322c303030307c3835383030307c30303331343809540d0a"));

        verifyPosition(decoder, binary(
                "2424010a142170525979ff9999753137353830322e3030302c412c313330362e303639342c4e2c31303035342e323439302c452c302e30302c3331332c3234313031372c2c2a30457c302e397c377c323530307c303030302c303030302c303130312c303241447c30323038303030353043313330313638353333427c30427c30303032313034357c30417c2520205e59454e53414241494348414924534f4e474b52414e244d522e5e5e3f3b363030373634333130303530303337333835333d3135303531393637303631343d3f2b202020202020202020202020203234202020202020202020202020312020202020202020202020203030303431313120203030313030545c0d0a"));

        verifyPositions(decoder, binary(
                "2424006661172036237118668801003039333630342e3030302c562c303330332e333231352c4e2c31303134372e313530302c452c302e30302c2c3235313031377c302e307c302e307c303030307c303030302c303030307c30303030303230343259ca0d0a"));

        verifyPositions(decoder, binary(
                "242401d961172036237118668805003039353830332e3030302c412c303330332e333431392c4e2c31303134372e343130342c452c372e30342c3230362e36312c3235313031377c302e307c302e307c303230307c303030302c303030307c3030303031313532325c003039353833332e3030302c412c303330332e323630302c4e2c31303134372e333734342c452c31302e33382c3236332e31342c3235313031377c302e307c302e307c303230307c303030302c303030307c3030303031313734355c003039353930332e3030302c412c303330332e313833382c4e2c31303134372e333735362c452c382e34392c3232332e37372c3235313031377c302e307c302e307c303230307c303030302c303030307c3030303031313839375c003039353933332e3030302c412c303330332e313033312c4e2c31303134372e333435332c452c382e37312c3139312e35302c3235313031377c302e307c302e307c303230307c303030302c303030307c3030303031323130325c003130303030302e3030302c412c303330332e313032332c4e2c31303134372e333338372c452c302e30302c3231332e36392c3235313031377c302e307c302e307c303030307c303030312c303030307c3030303031323131380d110d0a"));

        verifyPosition(decoder, binary(
                "2424007f1092ffffffffff9999523232303534392e3030302c412c333533372e313231372c4e2c30313130302e303633332c452c362e34382c3139332c3238303631372c2c2a30357c302e387c32347c323030307c303030432c303030417c303235443030303230303833354437427c31357c3037303636424142f7310d0a"));

        verifyAttributes(decoder, binary(
                "242400561001ffffffffff99553030303030302e3030302c562c303030302e303030302c532c30303030302e303030302c572c302e30302c302e30302c3232303839392c2c2c412a37457c7c307c3030303059ae0d0a0000"));

        verifyPosition(decoder, binary(
                "242400706573402852404799553130313932372e3030302c412c313732362e38323739332c4e2c30373832382e31393637312c452c312e382c362e342c3137313131362c2c2a32427c312e36387c3534342e327c313030307c303030302c303030307c3030303032383638373a1a0d0a"));

        verifyPosition(decoder, binary(
                "2424007d0000000000000099553231303333302e3030302c562c343533342e333832342c532c30373230332e303630302c572c302e30302c302c3231313031362c2c2a31327c302e307c3332397c323030307c303030452c303030437c303244413030303145413634393541417c31307c30303030303030306e540d0a"));

        verifyAttributes(decoder, binary(
                "4040005066104020094432990131302E312C302C3135362C302E30302C31392E36312C2D33342C33342E32362C32312E38332C372E39312C313033332C322E36392C362E35352C302C302C309DBF0D0A"));
        
        verifyAttributes(decoder, binary(
                "242400736610402421174399553130353033342e3937382c412c333933352e333638392c4e2c30303233382e313638342c452c303034382c3034322c3038313231362c2c2a31437c31312e357c3139347c313030317c303341362c303030307c30303130343030307c3030303030303cd00d0a2424004e66104024211743990131342e312c323638372c39302c32312e35372c342e37312c38352c372e31302c382e31362c342e32372c3130342c302e33342c392e33342c302c312c30b7160d0a2424003266104024211743990232352c322e34302c302e37392c32322c34332c3131392c333735362c37352c3132e4c90d0a"));

        verifyPosition(decoder, binary(
                "242400746251103044ffff99553033353033392e3939392c412c323832332e373632312c4e2c31303635322e303730342c572c3030302e302c3030302e302c3136303631362c2c2c412a37357c302e397c323038332e327c303030307c303030302c303030307c31303034333736333265780d0a"));

        verifyPosition(decoder, binary(
                "24240072190820157fffff99553039343335342e3030302c412c313930372e303631392c4e2c30373235312e333235312c452c3031302e312c3138382e352c3234303231362c2c2c412a36427c302e387c36352e327c303830307c303030302c303030307c303336343838373532c73f0d0a"));

        verifyPosition(decoder, binary(
                "242400680790209818ffff99553038333235382e3030302c412c303131352e393338302c532c30333634382e313430392c452c302e30302c3331352e35352c3132303131367c302e37347c313930322e337c303430307c303030302c303030307c302e30f41b0d0a"));

        verifyNull(decoder, binary(
                "24240011671440258855405000b24d0d0a"));

        verifyPosition(decoder, binary(
                "242400706796502079108999553131333131382e3030302c412c313033372e393637382c4e2c30363132312e353637392c572c302e35342c322e34322c3330303931352c2c2c412a37307c302e37377c392e397c303030307c303030302c303161327c3030313138373132374cae0d0a"),
                position("2015-09-30 11:31:18.000", true, 10.63280, -61.35947));

        verifyPosition(decoder, binary(
                "24240074630700194707719966009E1F7F00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000007C3132303334302C3238303630362C323430302E303030302C4E2C31323130302E303030302C458F7E0D0A"),
                position("2006-06-28 12:03:40.000", true, 24.00000, 121.00000));

        verifyPosition(decoder, binary(
                "24240076220720151fffff99660012b3ab00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000007c3135303634382c3233303731352c313931352e37323835362c4e2c30373235322e35333034342c456dd00d0a"));

        verifyNull(decoder, binary(
                "24240000123456FFFFFFFF50008B9B0D0A"));

        verifyPosition(decoder, binary(
                "242400722015032700004299553134313131352e3030302c412c353031312e343335342c4e2c30303834332e373039322c452c3030302e302c3034342e362c3134303431352c2c2c412a36437c322e317c39392e347c303030307c303030302c303030307c3030303032343730350e480d0a"));
        
        verifyPosition(decoder, binary(
                "2424006e241120141fffff99553039333931302e30302c412c313931342e37373736352c4e2c30373235302e36383037322c452c302e3035312c2c3230313231342c2c2c442a37357c302e38327c322e387c303030307c303030302c303030307c3031303833373433311d170d0a"));

        verifyPosition(decoder, binary(
                "24240000123456FFFFFFFF99553033353634342E3030302C412C323233322E363038332C4E2C31313430342E383133372C452C302E30302C2C3031303830392C2C2A31437C31312E357C3139347C303030307C303030302C3030303069620D0A"));

        verifyPosition(decoder, binary(
                "242400003358019703581F99553133343335312E3030302C412C303932352E353032352C4E2C30363931342E383130372C572C302E30302C32332C3330313031322C2C2A32437C302E387C3138367C323030307C303132362C303046467C303244453030303244384344423431357C30367C303046443642373995820D0A"));

        verifyPosition(decoder, binary(
                "242400001691000484124F99553134303630332E3030302C412C303933342E323535342C4E2C30363931332E303936362C572C302E30302C2C3330313031322C2C2A30327C302E387C3230377C30303030FA420D0A"));

        verifyPosition(decoder, binary(
                "2424000045124220306FFF9999143135353432322E3030302C562C323233302E373632332C4E2C31313430332E343231382C452C302E30302C302C3036303231312C2C2A31417C302E307C32367C303030307C303030302C303030307C303030303030303030303030303030307C36337C3030303030303030BAC10D0A"));

        verifyPosition(decoder, binary(
                "242400008621700142458F9999503139323935382E3030302C412C333632372E313639392C4E2C30313034332E353632372C452C302E30302C3233392C3039313231322C2C2A30467C312E307C377C303030307C303141392C303139377C303235443030303230303541383639467C31327C3030303333424233E2480D0A"));

        verifyPosition(decoder, binary(
                "24240000123456789FFFFF99553032303630302E3933302C412C323330392E323035312C4E2C31313331382E383434392C452C302E30302C302E30302C3039303731302C2C2C412A36417C322E367C39362E377C303030307C303030302C334646467C303030303030303030C4520D0A"));
        
        verifyPosition(decoder, binary(
                "242400005977203744058499553032303131372E3030302C412C343131372E393231322C4E2C30383133302E323039362C572C302E30302C3330332E38352C3236303231337C312E367C30307C303030307C303030302C3030303071CD0D0A"));

        verifyPosition(decoder, binary(
                "242400003511111111111199553133343734332e3030332c412c303634382e393836362c532c31303730372e353739352c452c3030302e302c3030302e302c323630333133f3150d0a"));

        verifyPosition(decoder, binary(
                "242400000091800369764199553038353133302e3030302c412c333035332e313634352c4e2c30373535352e373437362c452c302e30302c32372c3136303431332c2c2a33467c302e387c3234357c323030307c303346372c303030302c303030302c303031422c303030302c303030302c303030302c303030307c303139343030303230314343363237437c31417c3031313630383439e6a70d0a"));
        
        verifyPosition(decoder, binary(
                "2424000026016100901fff99553136353835332c412c343130392e36303231322c4e2c3833382e35393131392c572c332e3838332c31322e30302c3034303731332c2c2a34467c322e357c3131307c000600007c0000010f7c303242302c3042333697740d0a"));

        verifyNull(decoder, binary(
                "2424000067622010053562aa0000010001ae4f00000007800000003039353135362e3030302c412c323632332e383936362c4e2c30353030352e303638302c452c32342e352c3234312e302c323231303133599c0d0a"));

        verifyPosition(decoder, binary(
                "242400001007ffffffffff99553136323330392e3035342c562c303933312e393136332c4e2c30363931312e383233332c572c2c2c3235313131332c2c2c4e2a36437c7c3135387c303030309cc60d0a"));

        verifyAttributes(decoder, binary(
                "242400003563070435652099553035323034322e3030302c412c343435382e333536352c4e2c30343130342e343831332c452c302e30302c302e30302c3139303131342c2c2a39437c302e3730303030307c2d3835393131373337367c303130307c307c7c7c4f2a0d0a"));
        
        verifyPosition(decoder, binary(
                "2424005035784251ffffff99553030303033362e3938312c562c303933312e333437312c4e2c30363931312e383431322c572c2c2c3238303131342c2c2c4e2a36357c7c3136387c323030305e420d0a"));

        verifyPosition(decoder, binary(
                "2424007811223344ffffff99553031303735372e3030302c412c323935392e313337342c4e2c30393534302e333238342c572c3030302e302c3038382e372c3234303631342c2c2c412a37397c312e347c33352e317c303030307c303030312c303030307c3030303030333732337c3030303030e39f0d0a"));

        verifyPosition(decoder, binary(
                "2424007f3568960306760199553131303932342e3030302c412c343533342e323538352c4e2c30313933382e363531342c452c302e30302c2c3237303731342c2c2c412a37317c312e377c3130307c383030307c303737422c303030302c303030302c303030302c303030302c303030302c303030302c303030305dfc0d0a"));
        
        verifyPosition(decoder, binary(
                "2424007f2015603256ffff99553230303230392e30302c412c313734342e36393434382c4e2c30383331392e30353537302c452c31302e3236322c3234382e35352c3236303631352c2c2c442a35437c302e39397c33312e397c303830317c303030302c303030637c3030303933303131367c3030376165313035d5550d0a"));

    }

}
