

select *,(select top 1 s.statename from state s where s.state_id=bidder.state) as newstate,
(select top 1 s.country_name from country s where s.country_id=bidder.country) as newcountry,
(select top 1 s.lang_name from languages s where s.lang_id=bidder.lang_id) as newlang,
(select top 1 s.currency_symbol from currency s where s.currency_id=bidder.currency_id) as newcurr,
(select top 1 s.currency_short_name from currency s where s.currency_id=bidder.currency_id) as newcurr1,
(select top 1 s.currency_name from currency s where s.currency_id=bidder.currency_id) as newcurr2
 from bidder where company_id=146 order by bidder_id
 
 
 select  
'insert into MailMaster values ('
,''',''',mailMasterID     
,''',''',caption
,''',''',description
,''',''',isDemo
,''',''',groupNumber
,''',''',orderNumber
,''',''',deleted
,''',''',parentMailMasterID,''''
,')'
from MailMaster where mailMasterID>59

replace ' with ''
 
select 'insert into DefaultMailFormat (
mailMasterID,
orderNumber,
mailText,
attributeMasterID,
formatType,
languageMasterID)
values
('+
cast(mailMasterID as varchar)+','+
cast(orderNumber as varchar)+','+''''+
replace(mailText,'''','''''')+''''+','+
cast(attributeMasterID as varchar)+','+
cast(formatType as varchar)+','+
cast(languageMasterID as varchar)
+')' from DefaultMailFormat where languageMasterID = 1 and mailMasterID>59

