import{c as f}from"./ClientPage-bc5f392c.js";import{_ as r,o as l,i as $,j as t,n as i,k as g,f as o,c as d,w as _,g as b,R as x}from"./svg-icon-68e796f9.js";import"./mdi-4222cd55.js";const k={data(){return{selectedTab:"ALL"}}},C={class:"post-tabs-wrapper"},T={class:"post-tabs"},L={class:"tabs"};function S(c,s,a,p,e,u){return l(),$("div",C,[t("div",T,[t("div",L,[t("div",{class:"tab",onClick:s[0]||(s[0]=n=>e.selectedTab="ALL")},[t("button",{class:i(`${e.selectedTab==="ALL"?"tab-btn-selected":"tab-btn"}`)}," ALL ",2)]),t("div",{class:"tab",onClick:s[1]||(s[1]=n=>e.selectedTab="Spring")},[t("button",{class:i(`${e.selectedTab==="Spring"?"tab-btn-selected":"tab-btn"}`)}," Spring ",2)]),t("div",{class:"tab",onClick:s[2]||(s[2]=n=>e.selectedTab="Node")},[t("button",{class:i(`${e.selectedTab==="Node"?"tab-btn-selected":"tab-btn"}`)}," Node ",2)])])]),g(c.$slots,"default")])}const w=r(k,[["render",S]]);const y={},A=t("div",{class:"post-card-column-wrapper"},[t("div",{class:"post-card-column"},[t("div",{class:"post-card-wrapper"},[t("a",{class:"post-card"},[t("div",{class:"title"}," 테스트 코드를 왜 그리고 어떻게 작성해야 할까? "),t("p",{class:"description"},"테스트 코드가 필요한 이유와 잘 작성하는 방법에 대해 공유합니다."),t("div",{class:"info"},[t("div",{class:"date"},"April 11, 2023"),t("div",{class:"tags"},[t("div",{class:"tag"},"test"),t("div",{class:"tag"},"jest")])])])])])],-1);function N(c,s){const a=o("router-link");return l(),d(a,{to:"/post"},{default:_(()=>[A]),_:1})}const h=r(y,[["render",N]]);const B={components:{ClientPage:f,PostTabs:w,PostCard:h},data(){return{}}},P=t("div",{class:"more-post-card"},[t("button",{class:"more-post-card-button"},"포스트 더보기")],-1);function V(c,s,a,p,e,u){const n=o("post-card"),m=o("post-tabs"),v=o("client-page");return l(),d(v,null,{default:_(()=>[b(m,null,{default:_(()=>[b(n)]),_:1}),P]),_:1})}const j=r(B,[["render",V]]),R={components:{mainSection:j,RouterView:x},computed:{}};function z(c,s,a,p,e,u){const n=o("mainSection");return l(),d(n)}const D=r(R,[["render",z]]);export{D as default};