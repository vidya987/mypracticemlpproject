import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EmporderhistoryComponent } from './emporderhistory.component';

describe('EmporderhistoryComponent', () => {
  let component: EmporderhistoryComponent;
  let fixture: ComponentFixture<EmporderhistoryComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EmporderhistoryComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EmporderhistoryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
