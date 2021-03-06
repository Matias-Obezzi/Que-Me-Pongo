package as.edu.utn.frba.dds.qmp.domain.prenda;

import as.edu.utn.frba.dds.qmp.domain.prenda.material.Color;
import as.edu.utn.frba.dds.qmp.domain.prenda.material.Material;
import as.edu.utn.frba.dds.qmp.domain.prenda.material.TipoDeMaterial;
import as.edu.utn.frba.dds.qmp.domain.prenda.material.Trama;

public class Prenda {
  private TipoDePrenda tipo;
  private Material material;

  public Prenda(TipoDePrenda tipo, Material material) {
    this.tipo = tipo;
    this.material = material;
  }

  public TipoDePrenda tipo() {
    return tipo;
  }

  public Categoria categoria() {
    return tipo.categoria();
  }

  public Material material() {
    return material;
  }

  public Trama trama() {
    return material.trama();
  }

  public TipoDeMaterial tipoMaterial() {
    return material.tipo();
  }

  public Color colorPrincipal() {
    return material.colorPrincipal();
  }

  public Color colorSecundario() {
    return material.colorSecundario();
  }

  public boolean acordeATemperatura(int temperatura) {
    return this.tipo.temperaturaValida(temperatura);
  }

  public boolean esParteSuperior() {
    return this.categoriaEs(Categoria.PARTE_SUPERIOR);
  }

  public boolean esParteInferior() {
    return this.categoriaEs(Categoria.PARTE_INFERIOR);
  }

  public boolean esCalzado() {
    return this.categoriaEs(Categoria.CALZADO);
  }

  public boolean esAccesorio() {
    return this.categoriaEs(Categoria.PARTE_INFERIOR);
  }

  private boolean categoriaEs(Categoria esperada) {
    return this.categoria().equals(esperada);
  }
}
