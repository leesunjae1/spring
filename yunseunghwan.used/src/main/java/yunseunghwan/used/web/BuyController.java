package yunseunghwan.used.web;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import yunseunghwan.used.domain.Trade;
import yunseunghwan.used.service.TradeService;

@RestController
@RequestMapping("buy")
public class BuyController {
	@Autowired private TradeService tradeService;
	
	@GetMapping
	public ModelAndView buys(ModelAndView mv) {
		mv.setViewName("buy/post");
		return mv;
	}
	
	@GetMapping("list")
	public List<Trade> buyList(String tradeCode) {
		tradeCode = "구매";
		return tradeService.getTrades(tradeCode);
	}
	
	@GetMapping("write")
	public ModelAndView writeTrade(ModelAndView mv, HttpSession session) {
		String userId = (String) session.getAttribute("userId");
		if(userId == null) {
			mv.setViewName("redirect:/user/login");
		} else {			
			mv.addObject("userId", userId);
			mv.setViewName("buy/write");
		}
		return mv;
	}
	
	@PostMapping("add")
	public ModelAndView addTrade(HttpSession session, ModelAndView mv, Trade trade) {
		tradeService.addTrade(session, trade);
		mv.setViewName("redirect:/buy");
		return mv;
	}
	
	@GetMapping("view")
	public ModelAndView tradeView(ModelAndView mv, HttpSession session, Trade trade) {
		mv.setViewName("buy/view");
		return tradeService.getTrade(trade, mv, session);
	}
	
	@GetMapping("edit")
	public ModelAndView editView(ModelAndView mv, Trade trade, HttpSession session) {
		mv.setViewName("buy/edit");
		return tradeService.getTrade(trade, mv, session);
	}
	
	@PutMapping("fix") 
	public void fixTrade(HttpSession session, ModelAndView mv, Trade trade){
		tradeService.fixTrade(trade, session);
	}
	
	@PutMapping("res") 
	public void ResTrade(HttpSession session, ModelAndView mv, Trade trade){
		tradeService.fixResTrade(trade);
	}
	
	@PutMapping("finish") 
	public void FinishTrade(HttpSession session, ModelAndView mv, Trade trade){
		tradeService.fixFinishTrade(trade);
	}
	
	@GetMapping("res")
	public ModelAndView resTrades(ModelAndView mv) {
		mv.setViewName("buy/reservationList");
		return mv;
	}
	
	@GetMapping("resList")
	public List<Trade> reservationList(String getCode) {
		getCode = "RES";
		return tradeService.getTrades(getCode);
	}
	
	@DeleteMapping("del/{tradeNum}")
	public void delTrade(@PathVariable int tradeNum) {
		tradeService.delTrade(tradeNum);
	}
}
