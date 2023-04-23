package polymorphismDemo;

public class CustomerManager {
	private BaseLogger _logger;
	
	public CustomerManager(BaseLogger _logger) {
		this._logger = _logger;
	}

	public void add() {
		System.out.println("Müşteri eklendi");
		_logger.log("LOG MESAJ");
	}
}
