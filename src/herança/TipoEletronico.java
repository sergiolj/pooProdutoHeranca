package herança;

	public enum TipoEletronico{
		NOTEBOOK, TELEVISOR, CELULAR, PC;
	
		public int garantia(TipoEletronico t) {
			
			switch(t) {
			case NOTEBOOK, TELEVISOR, PC:
				return 12;
			
			case CELULAR:
				return 6;
				
			default:
				return 0;
			}
			
		}
	}
	
	
	

	