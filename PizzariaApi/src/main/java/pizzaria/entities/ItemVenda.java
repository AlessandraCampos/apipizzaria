package pizzaria.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="tb_item_venda")
public class ItemVenda {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long Id;	

	@ManyToOne
	@JoinColumn(name = "venda_id")
	private Venda venda;
	
	@ManyToOne
	@JoinColumn(name = "produto_id", referencedColumnName = "id")
	private Produto produto_id;	
	
	private int quantidade;
	
	private float valorunitario;
	
	private float valortotal;
	

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}

	public Produto getProduto_id() {
		return produto_id;
	}

	public void setProduto_id(Produto produto_id) {
		this.produto_id = produto_id;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public float getValorunitario() {
		return valorunitario;
	}

	public void setValorunitario(float valorunitario) {
		this.valorunitario = valorunitario;
	}

	public float getValortotal() {
		return valortotal;
	}

	public void setValortotal(float valortotal) {
		this.valortotal = valortotal;
	}
	
	
	public ItemVenda(Venda venda, Produto produto_id, int quantidade, float valorunitario, float valortotal) {
		super();
		this.venda = venda;
		this.produto_id = produto_id;
		this.quantidade = quantidade;
		this.valorunitario = valorunitario;
		this.valortotal = valortotal;
	}

	public ItemVenda() {
		// TODO Auto-generated constructor stub
	}
}